package kr.co.mash_up.nine_tique;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {NineTiqueApplication.class})
@ActiveProfiles(profiles = "test")
public class NineTiqueApplicationTests {

    @Test
    public void contextLoads() {
    }

}
