package org.example.cinehub_backend.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorType {

    INTERNAL_SERVER_ERROR(500, "Sunucuda beklenmeyen bir hata oldu. Lütfen tekrar deneyiniz", HttpStatus.INTERNAL_SERVER_ERROR),
    VALIDATION_ERROR(400, "Girilen parametreler hatalıdır. Lütfen kontrol ederek tekrar deneyiniz.", HttpStatus.BAD_REQUEST),
    INVALID_TOKEN(9001, "Geçersiz token bilgisi", HttpStatus.BAD_REQUEST),
    ADMIN_NOT_FOUND(9002, "Admin Kullanıcısı Bulunamadı!", HttpStatus.BAD_REQUEST),
    MAIL_NOT_VERIFIED(6004, "Mailiniz henüz onaylanmamış, lütfen mailinize gelen onay linkine tıklayınız.", HttpStatus.BAD_REQUEST),
    INVALID_USERNAME_OR_PASSWORD(6002, "Kullanıcı adı ya da şifre hatalıdır", HttpStatus.BAD_REQUEST),
    USERNAME_ALREADY_EXIST(6004, "Girilen kullanıcı adı sistemde mevcut. Lütfen tekrar deneyiniz.", HttpStatus.BAD_REQUEST),
    EMAIL_ALREADY_EXIST(6004, "Girdiğiniz email adresi sistemde mevcut. Lütfen tekrar deneyiniz.", HttpStatus.BAD_REQUEST),
    USER_NOT_FOUND(5001, "Kullanıcı bulunamadı!", HttpStatus.BAD_REQUEST),
    RESOURCE_NOT_FOUND(404, "Kaynak bulunamadı!", HttpStatus.NOT_FOUND); // Bu satır eklendi

    int code;
    String message;
    HttpStatus httpStatus;
}

