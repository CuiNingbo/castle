package castle;

public class HandlerHelp extends Handler{
	public HandlerHelp(Game game) {
		super(game);
	}
	@Override
	public void doCmd(String word) {
		System.out.println("��·��ô����������������У� go bye help");
		System.out.println("�磺\tgo east");
	}

}
