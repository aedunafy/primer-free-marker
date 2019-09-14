package com.aedunafy.lrnfm.directive;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

public class UpperDirective implements TemplateDirectiveModel{

	@Override
	public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body)
			throws TemplateException, IOException {
		
		if(body != null) {
			body.render(new UpperWriter(env.getOut()));
		} else {
            throw new RuntimeException("missing body");
        }
	}

	
	private static class UpperWriter extends Writer {

		private final Writer out;
		
		UpperWriter(Writer out){
			this.out = out;
		}
		
		@Override
		public void write(char[] cbuf, int off, int len) throws IOException {
			char[] transformedCbuf = new char[len];
			for (int i = 0; i < len; i++) {
                transformedCbuf[i] = Character.toUpperCase(cbuf[i + off]);
            }
            out.write(transformedCbuf);
		}

		@Override
		public void flush() throws IOException {
			out.flush();
			
		}

		@Override
		public void close() throws IOException {
			out.close();
			
		}
		
	}
}

