WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package org.cst8277.twitter.dtos;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private UUID id;
    private UUID author;
    private String content;
    private long timestamp;
}
