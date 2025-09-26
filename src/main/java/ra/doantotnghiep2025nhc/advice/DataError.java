package ra.doantotnghiep2025nhc.advice;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DataError<T> {
    private int code;
    private T message;
}
