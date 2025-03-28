package com.ecommerce.ecommerce_backend.exeption;

import lombok.Data;

@Data
public class ChangePasswordRequest {
    private String currentPassword;
    private String newPassword;

}

