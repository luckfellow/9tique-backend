package kr.co.mash_up.nine_tique.vo;

/**
 * Result Code 모음
 */
public final class ResultCodes {

    private ResultCodes() {
    }

    public static final Integer OK = 200;  // 정상처리
    public static final Integer CREATED = 201;  // 정상처리, 리소스 생성
    public static final Integer NO_CONTENT = 204;  // 정상처리, body에 아무값 없음
    public static final Integer BAD_REQUEST = 400;  // 잘못된 요청
    public static final Integer UN_AUTHORIZED = 401;  // 인증 필요
    public static final Integer FORBIDDEN = 403;  // 권한 없음
    public static final Integer NOT_FOUND = 404;  // 찾을 수 없음
}
