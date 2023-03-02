package com.pichain.pimall.usertip.utils;

import com.pichain.pimall.usertip.common.Constant;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;
import java.util.ResourceBundle;


@Component
public class LanguageUtils {


	public static String getMessage(String code) {
		System.out.println("==================" + code);
		Locale locale = null;
		HttpServletRequest request = GetRequestContextHolder.getRequest();
		if (request == null) {
			locale = new Locale("zh");
		} else {
			String languageKey = request.getHeader("languageKey");
			if (Constant.Language.LANGUAGE_KEY_CHINA_SIMPLE.equals(languageKey)) {
				System.out.println(languageKey + "===================语言：" + Constant.Language.LANGUAGE_KEY_CHINA_SIMPLE);
				locale = new Locale("zh");
			} else {
				System.out.println(languageKey + "=====" + code + "语言：en==============================");
				locale = new Locale("en");
			}
		}
		ResourceBundle resourceBundle = ResourceBundle.getBundle("responseMsg", locale);
		return resourceBundle.getString(code);
	}
}
