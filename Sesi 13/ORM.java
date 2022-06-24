public void tambahMhs () {
    Mahasiswa baru = new Mahasiswa();
    baru.setNRP(1);
    baru.setNama("fox");
    baru.setPassword("BootcampH8");

    HibernateUtil.getSessionFactory().getCurrentSession().save(baru);
}
