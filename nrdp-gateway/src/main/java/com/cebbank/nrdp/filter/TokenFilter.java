/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.itmayiedu.com
 */
package com.cebbank.nrdp.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class TokenFilter extends ZuulFilter {

	public Object run() throws ZuulException {
		// 获取上下文
		RequestContext currentContext = RequestContext.getCurrentContext();
		HttpServletRequest request = currentContext.getRequest();
		System.out.println(String.format("send %s request to %s",request.getMethod(),request.getRequestURL().toString()));
		String userToken = request.getParameter("token");
		if (StringUtils.isEmpty(userToken)) {
			currentContext.setSendZuulResponse(false);
			currentContext.setResponseStatusCode(401);
			currentContext.setResponseBody("userToken is null");
			return null;
		}
		try{
			int i=1;
			int a=i/0;
		}catch(Exception e){
			RequestContext context = RequestContext.getCurrentContext();
			context.set("error.status_code",401);
			context.set("error.exception",e);
			context.set("error.message","abc");
		}
		return null;
	}

	// 判断该过滤器是否生效
	public boolean shouldFilter() {
		return true;
	}

	// 过滤器的执行顺序。不同的过滤器允许返回相同的数值，自定义过滤器执行的顺序，数值越大越靠后执行，越小就越先执行
	public int filterOrder() {
		return 0;
	}

	// 返回过滤器类型；pre、route、post、error
	// pre：主要用在路由映射的阶段是寻找路由映射表的
	// routing:具体的路由转发过滤器是在routing路由器，具体的请求转发的时候会调用
	// error:一旦前面的过滤器出错了，会调用error过滤器。
	// post:当routing，error运行完后才会调用该过滤器，是在最后阶段的
	public String filterType() {
		return "pre";
	}

}
