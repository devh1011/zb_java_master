package org.example.annotation.general.suppresswarnings;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarningsExample {

    @SuppressWarnings({"unchecked", "rawtypes", "unused"})
    // 실무에서 거의 안씀 레거시 코드를 만질 때만 좀 사용한다고 함
    public void something() {
        List list = new ArrayList();
        list.add(123);
        list.add("데이터");
        System.out.println(list.get(0));
    }
}
