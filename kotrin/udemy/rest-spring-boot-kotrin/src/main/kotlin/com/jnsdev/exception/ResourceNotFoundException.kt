package com.jnsdev.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus
import java.lang.RuntimeException


/**
 * @Autor Jairo Nascimento
 * @Created 26/04/2022 - 14:18
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
class ResourceNotFoundException(exception: String?): RuntimeException(exception) {
}