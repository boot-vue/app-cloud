package com.bootvue.core.ddo.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDo {
    private Long id;
    private String username;
    private String role;
    private Boolean status;
    private LocalDateTime createTime;
}
