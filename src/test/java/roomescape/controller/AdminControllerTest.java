package roomescape.controller;

import io.restassured.RestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminControllerTest {


    @Test
    @DisplayName("어드민 메인 페이지로 정상적으로 이동한다.")
    void moveToAdminMainPage_Success() {
        RestAssured.given().log().all()
                .when().get("/admin")
                .then().log().all()
                .statusCode(200);
    }
}
