package com.top;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

/**
 * Description
 *
 * @author 袁幸成【yuanxc@3vjia.com】
 * @since 2018/07/07 10:09
 */
@Getter
@Setter
@ToString
public class User {

    @NonNull
    Long id;
    String name;
    Boolean sex;
}
