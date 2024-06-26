public class Account implements InOutInterface<Long>{
    long accountNumber;
    long haveMoney;
    String ownerName;

    Account(long accountNumber,String ownerName){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.haveMoney = 0;
    }

    @Override
    public void input(Long money) {
        if (money>0){
            haveMoney+=money;
            System.out.println("입금한 금액:"+haveMoney);
        }else {
            System.out.println("입금금액이 0보다 적습니다.");
        }
    }

    @Override
    public void Out(Long money) {
        if(money > 0 && money<=haveMoney){
            System.out.println("보유금액 : "+haveMoney);
            haveMoney-=money;
            System.out.println(money+" 출금하여 "+haveMoney+"원 남았습니다.");
        }else{
            System.out.println("출금실패 보유 금액이 출금 금액보다 적습니다.");
        }
    }
    public long haveMoney(){
        return haveMoney;
    }
    public String OwnerNAme(){
        return ownerName;
    }
}
