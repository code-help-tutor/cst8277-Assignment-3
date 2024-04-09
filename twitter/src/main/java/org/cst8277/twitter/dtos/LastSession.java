WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package org.cst8277.twitter.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LastSession {
    int lastLoginTimeStamp;
    int lastLogoutTimeStamp;
}
