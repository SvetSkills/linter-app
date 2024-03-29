package com.bsuir.annakhomyakova.service.dto;

import com.bsuir.annakhomyakova.domain.UserAnnKh;

public class UserDTO {

    private Long id;

    private String login;

    public UserDTO() {
    }

    public UserDTO(UserAnnKh user) {
        this.id = user.getId();
        this.login = user.getLogin();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
            "id='" + id + '\'' +
            ", login='" + login + '\'' +
            "}";
    }
}
