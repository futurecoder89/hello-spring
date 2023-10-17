package hello.hellospring;
import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringConfig {
    private final MemberRepository memberRepository;
    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    /*@Bean
    public TimeTraceAop timeTraceAop() {
        return new TimeTraceAop();
    }*/

}

/*    @Bean
    public MemberRepository memberRepository() {*/
        //return new MemoryMemberRepository(); 스프링은 저장소를 변경하는것에 용이하다
        //*return new JdbcMemberRepository(dataSource);*//*
        //*return new JdbcTemplateMemberRepository(dataSource);*//*
        /*return new JpaMemberRepository(em);*/
/*    }*/

