package cn.ljf.task3.main;

import cn.ljf.task3.template.Account;
import cn.ljf.task3.template.CurrentAccount;
import cn.ljf.task3.template.SavingAccount;

public class Client {
	public static void main(String[] args) {
		Account currentAccount = new CurrentAccount();
		currentAccount.handle();
		System.out.println();
		Account savingAccount = new SavingAccount();
		savingAccount.handle();
	}
}
