package stark.coderaider.cygnus.registration.service;

import org.apache.dubbo.config.annotation.DubboService;
import stark.coderaider.cygnus.registration.rpc.IServiceQuery;

@DubboService(version = "${dubbo.service.version}")
public class ServiceQuery implements IServiceQuery
{
}
