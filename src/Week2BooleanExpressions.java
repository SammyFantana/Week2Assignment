
public class Week2BooleanExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isHotOutside = true;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = false;
		double costOfMilk = 3.99;
		double moneyInWallet = 67.75;
		int thirstLevel = 8;
		boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		boolean willBuyMilk = isHotOutside && (thirstLevel > 3) && moneyInWallet > (costOfMilk * 2);
		
	}

}
