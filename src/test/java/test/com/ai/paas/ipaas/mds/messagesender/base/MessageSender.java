package test.com.ai.paas.ipaas.mds.messagesender.base;

import com.ai.paas.ipaas.mds.IMessageSender;
import com.ai.paas.ipaas.mds.MsgSenderFactory;
import com.ai.paas.ipaas.uac.vo.AuthDescriptor;

public class MessageSender {
	private final String AUTH_ADDR = "http://10.1.228.198:14821/iPaas-Auth/service/check";
	private AuthDescriptor ad = null;
	private IMessageSender iMessageSender = null;

	public IMessageSender getClient() throws Exception {
		ad = new AuthDescriptor(AUTH_ADDR, "393170232@qq.com", "123456",
				"MDS002");
		try {
			iMessageSender = MsgSenderFactory.getClient(ad, "B9178FB878834E7BA8CD02FB981C7F4D_MDS002_553246307");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return iMessageSender;
	}
}
