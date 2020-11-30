package io.dsub.shoppingdemo.user;

import io.dsub.shoppingdemo.enums.Gender;
import io.dsub.shoppingdemo.model.User;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserCommand {
    // 이런 경우까지 일일이 분리할 경우에는 너무 클래스가 많아지니까 가급적 정리해서 이너클래스로 정의
    @Data
    public static class CreateUser {
        @NotBlank
        private String name;
        @Email
        private String email;
        @NotBlank
        private String password;
        // enum 을 쓰는 경우 spell check 등 스프링이 알아서 하기 때문에 더 편하다!
        @NotNull
        private Gender gender;
        @NotBlank // TODO: 애너테이션 패키지로 별도로 빼서 따로 만들어보기
        private String address;

        public User toUser() {
            return User.builder()
                    .name(name)
                    .email(email)
                    .password(password)
                    .gender(gender)
                    .address(address)
                    .build();
        }
    }
    @Data
    public static class UpdateUser {
        @NotBlank
        private String name;
        @NotBlank
        private String address;

        public User toUser() {
            return User.builder()
                    .name(name)
                    .address(address)
                    .build();
        }
    }
}
