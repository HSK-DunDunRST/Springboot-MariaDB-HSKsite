package kr.co.ipdisk.dundunhsk.HSKsite.data.dtoSet;

import kr.co.ipdisk.dundunhsk.HSKsite.common.ErrorResponse;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ApiResponseDTO<T> {

    private boolean success;
    private T response;
    private ErrorResponse errorResponse;

    @Builder
    private ApiResponseDTO(boolean success, T response, ErrorResponse errorResponse) {
        this.success = success;
        this.response = response;
        this.errorResponse = errorResponse;
    }
    
}
