package com.moviemania.server.service.impls;

import com.moviemania.server.model.Admin;
import com.moviemania.server.payload.AdminDto;
import com.moviemania.server.repository.AdminRepository;
import com.moviemania.server.service.AdminService;
import com.moviemania.server.service.TheatreService;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpls implements AdminService {
    private AdminRepository adminRepository;

    public AdminServiceImpls(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public AdminDto createAdmin(AdminDto adminDto) {
        Admin admin=mapToEntity(adminDto);
        Admin userAdmin=adminRepository.save(admin);
        return mapToDto(userAdmin);

    }
    private AdminDto mapToDto(Admin admin)
    {

        AdminDto adminDto=new AdminDto();
        adminDto.setAdminId(admin.getAdminId());
        adminDto.setAdminContact(admin.getAdminContact());
        adminDto.setAdminPassword(admin.getAdminPassword());
        adminDto.setAdminName(admin.getAdminName());
        adminDto.setDateOfBirth(admin.getDateOfBirth());
        return  adminDto;
    }
    private  Admin mapToEntity(AdminDto adminDto)
    {
        Admin admin=new Admin();
        admin.setAdminId(admin.getAdminId());
        admin.setAdminContact(adminDto.getAdminContact());
        admin.setAdminPassword(adminDto.getAdminPassword());
        admin.setAdminName(adminDto.getAdminName());
        admin.setDateOfBirth(adminDto.getDateOfBirth());
        return admin;


    }


}
