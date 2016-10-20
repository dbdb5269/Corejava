类结构如下：
==============================================
Account
----------------------------------------------
#balance:double			余额	
----------------------------------------------
+Account(double:balance)			
+getBalance():double
+deposit(double:amount):boolean	存钱，amount为存入金额，返回true
+withdraw(double:amount):boolean	取钱，amount为取出金额，如果amount>balance返回false，amount<=balance返回true
==============================================
SavingAccount(extends Account)
----------------------------------------------
-rate:double			利率		
----------------------------------------------
+SavingAccount(double:balance, double rate)
==============================================
CheckingAccount(extends Account)
----------------------------------------------
-overdraft:double			透支额度
----------------------------------------------
+CheckingAccount(double:balance, double overdraft)
+CheckingAccount(double:balance)	设置透支额度为0
+withdraw(double:amount):boolean	取钱amount为取出金额，如果amount>balance+overdraft返回false，amount<=balance+overdraft返回true
+getOverdraft():double
==============================================
Customer
----------------------------------------------
-account:Account			账户
-name:String			姓名
----------------------------------------------
+Customer(String:name)
+getAccount():Account		
+setAccount(Account:account):void
+getName():String
==============================================
Bank
----------------------------------------------
-customers:Customer[]		客户
-custNum:int			客户数量
----------------------------------------------
+Bank()
+addCustomer(Customer:customer):void
+getCustomer(int:index):Customer	获取指定位置的客户
+getCustomerNum():int
==============================================

说明：
1. 将类结构以代码形式表示，并对方法和构造器提供合理的实现。
2. 使用TestBanking类对代码进行测试

符号含义：
#protected
+public
-private