package com.hand.AOP;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.hand.Util.SpringBeanFactory;
import com.hand.db.*;
public class TransactionTool {
	PlatformTransactionManager ptm;
	TransactionTemplate tt;
	
	public PlatformTransactionManager getPtm() {
		return ptm;
	}

	public void setPtm(PlatformTransactionManager ptm) {
		this.ptm = ptm;
	}

	public TransactionTemplate getTt() {
		return tt;
	}

	public void setTt(TransactionTemplate tt) {
		this.tt = tt;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void doCustomerAddIdEntityTransaction(final Film aim){
		tt.execute(new TransactionCallback() {
			public Object doInTransaction(TransactionStatus status){
				try{
					SpringBeanFactory.getBeanFactory().getBean("FilmDao", CanAddToDb.class).AddIdEntity(aim);
				}catch(Exception e){
					ptm.rollback(status);
					System.out.println("添加Customer失败，执行回滚\n原因："+e.getMessage());
				}
				return null;
			}
		});
	}
	

}
