package kr.co.ipdisk.dundunhsk.HSKsite.data.dtoSet;

import kr.co.ipdisk.dundunhsk.HSKsite.common.ErrorResponse;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ApiResponseDTO<T> {

    private boolean success;
    private T data;
    private ErrorResponse errorResponse;

    @Builder
    private ApiResponseDTO(boolean success, T data, ErrorResponse errorResponse) {
        this.success = success;
        this.data = data;
        this.errorResponse = errorResponse;
    }
    
}
