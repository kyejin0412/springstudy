package hello.core.member;

public class MemberServiceImpl implements  MemberService{
    //인터페이스에 대한 구현체가 하나만 있으면 인터페이스 이름+impl이라고 명명하는 경우가 많음. 관리하기 쉽게.
//   MemberRepository(인터페이스)와 MemoryMemberRepository(구현체) 모두 의존하고 있기 때문에 DIP를 위반하는 코드.
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

//    회원가입
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }
//   회원조회
    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
