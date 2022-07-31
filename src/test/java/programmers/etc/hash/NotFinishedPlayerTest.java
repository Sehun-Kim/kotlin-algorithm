package programmers.etc.hash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotFinishedPlayerTest {

    @Test
    void test1() {
        // given
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        // when
        String result = new NotFinishedPlayer().solution(participant, completion);

        // then
        assertEquals("leo", result);
    }

    @Test
    void test2() {
        // given
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        // when
        String result = new NotFinishedPlayer().solution(participant, completion);

        // then
        assertEquals("vinko", result);
    }

    @Test
    void test3() {
        // given
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        // when
        String result = new NotFinishedPlayer().solution(participant, completion);

        // then
        assertEquals("mislav", result);
    }

}