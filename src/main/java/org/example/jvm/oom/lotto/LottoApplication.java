package org.example.jvm.oom.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class LottoApplication {
    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();

        // OOM을 발생시키기 위해 큰 객체를 리스트에 무한히 추가
        List<int[]> lottoHistory = new ArrayList<>();
        List<String> bigStrings = new ArrayList<>();

        Random random = new Random();

        while (true) {
            // 로또 번호 생성
            int[] lotto = generator.generateLottoNumbers();
            lottoHistory.add(lotto);

            System.out.println(Arrays.toString(lotto));

            // OOM 가속용: 큰 문자열 생성
            char[] chars = new char[1000];
            Arrays.fill(chars, 'A');
            bigStrings.add(new String(chars));
        }
    }
}

class LottoGenerator {
    private static final int LOTTO_SIZE = 6;
    private static final int MAX_NUMBER = 45;
    private Random random = new Random();

    public int[] generateLottoNumbers() {
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < LOTTO_SIZE) {
            numbers.add(random.nextInt(MAX_NUMBER) + 1);
        }
        return numbers.stream().mapToInt(Integer::intValue).toArray();
    }
}
