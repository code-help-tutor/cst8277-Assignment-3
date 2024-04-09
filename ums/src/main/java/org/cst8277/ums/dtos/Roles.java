WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package org.cst8277.ums.dtos;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Roles {
    UUID roleId;
    String role;
    String description;
}
