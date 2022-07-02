package com.sparte.sparte.practice.domain.utiles;

import com.sparte.sparte.practice.domain.MemoRepository;
import com.sparte.sparte.practice.domain.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor // final 멤버 변수를 자동으로 생성합니다.
@Component // 스프링이 필요 시 자동으로 생성하는 클래스 목록에 추가합니다.
public class Scheduler {

    private final MemoRepository memoRepository;
    private final MemoService memoService;
    // 초, 분, 시, 일, 월, 주 순서
    @Scheduled(cron = "0 0 0 * * *")
    public void updatePrice() throws InterruptedException {
        memoRepository.deleteAll();
    }
}