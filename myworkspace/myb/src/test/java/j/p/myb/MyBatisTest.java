package j.p.myb;

import static org.junit.Assert.*;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.junit.Test;

@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class })
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
//@ContextConfiguration (locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class MyBatisTest {
    @Inject
    private SqlSessionFactory sqlFactory;
    
    @Test
    public void testFactory() {
        System.out.println(sqlFactory);
    }
    @Test
    public void testSession() {
    	System.out.println("TEST BEGIN!");
        try (SqlSession session = sqlFactory.openSession()){
            System.out.println(session);
        	System.out.println("TEST SUCCESS!");
        } catch (Exception e) {
        	System.out.println("TEST FAIL!");
            e.printStackTrace();
        }
    	System.out.println("TEST END!");
    }



}
