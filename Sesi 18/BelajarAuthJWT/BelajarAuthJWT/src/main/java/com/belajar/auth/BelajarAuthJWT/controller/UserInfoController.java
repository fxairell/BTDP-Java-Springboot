package com.belajar.auth.BelajarAuthJWT.controller;

import java.security.NoSuchAlgorithmException;

import javax.xml.bind.ValidationException;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.belajar.auth.BelajarAuthJWT.model.UserInfo;
import com.belajar.auth.BelajarAuthJWT.repository.UserInfoRepository;

@Tag(name = "UserInfo", description = "API for userinfo")
@RestController
public class UserInfoController {
    final private UserInfoRepository userInfoRepository;

    // private HashData hashData = new HashData();

    public UserInfoController(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    @Operation(summary = "Create a new user", description = "Create a new user with username , fullname and password", tags = { "userinfo" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation",
                    content = @Content(schema = @Schema(implementation = UserInfo.class))) })
    @PostMapping("/user")
    public Boolean create(@RequestBody Map<String, String> body) throws NoSuchAlgorithmException {
        String username = body.get("username");
        if (userInfoRepository.existsByUsername(username)){
            throw new ValidationException("Username already existed");
        }

        String password = body.get("password");
        String encodedPassword = new BCryptPasswordEncoder().encode(password);
        // String hashedPassword = hashData.get_SHA_512_SecurePassword(password);
        String fullname = body.get("fullname");
        userInfoRepository.save(new UserInfo(username, encodedPassword, fullname));
        return true;
    }
}
