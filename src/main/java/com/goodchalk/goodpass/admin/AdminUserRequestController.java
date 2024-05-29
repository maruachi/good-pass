package com.goodchalk.goodpass.admin;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AdminRequestController {
    @GetMapping("/admin-user")
    public String getRequestAdminPage() {
        return "admin-user";
    }

    @PostMapping("/admin-user")
    public void requestAdminUser(@RequestBody AdminUserRequestForm adminUserRequestForm) {
        
    }
}
