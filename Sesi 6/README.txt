Penggunaan git (manual)

git config --global user.name "fxairell"
git config --global user.email fxairell99@mail.ugm.ac.id
git config --list

1. git init
// Pertama kali (opsional)
2. git remote add origin https://github.com/fxairell/Sesi-1.git
3. git add .
4. git commit -m "Pertama"
5. git branch -M main
// Pertama kali inisiasi project di git
6. git push -u origin main

git pull

git push --set-upstream origin main