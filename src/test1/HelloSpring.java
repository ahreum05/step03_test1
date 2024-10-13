package test1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloSpring {
    public static void main(String[] args) {
    	// 1.  스프링 컨테이너 구동
    	GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("test1/bean.xml");
        
    	// 2. bean 객체 얻어오기
    	Calc calcAdd = (Calc) context.getBean("calcAdd");
        calcAdd.calculate();
        
        Calc calcMul = (Calc) context.getBean("calcMul");
        calcMul.calculate();
        
        // 3. 스프링 컨테이너 종료
        context.close();
    }
}