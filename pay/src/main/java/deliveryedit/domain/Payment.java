package deliveryedit.domain;

import deliveryedit.domain.Paid;
import deliveryedit.domain.Refunded;
import deliveryedit.PayApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Payment_table")
@Data

public class Payment  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long orderId;

    @PostPersist
    public void onPostPersist(){


        Paid paid = new Paid(this);
        paid.publishAfterCommit();



        Refunded refunded = new Refunded(this);
        refunded.publishAfterCommit();

    }

    public static PaymentRepository repository(){
        PaymentRepository paymentRepository = PayApplication.applicationContext.getBean(PaymentRepository.class);
        return paymentRepository;
    }




    public static void cancelPayment(Canceled canceled){

        /** Example 1:  new item 
        Payment payment = new Payment();
        repository().save(payment);

        */

        /** Example 2:  finding and process
        
        repository().findById(canceled.get???()).ifPresent(payment->{
            
            payment // do something
            repository().save(payment);


         });
        */

        
    }


}
