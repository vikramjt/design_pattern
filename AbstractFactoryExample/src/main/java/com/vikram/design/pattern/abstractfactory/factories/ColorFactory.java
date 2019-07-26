package com.vikram.design.pattern.abstractfactory.factories;

import com.vikram.design.pattern.abstractfactory.Model.color.Black;
import com.vikram.design.pattern.abstractfactory.Model.color.Color;
import com.vikram.design.pattern.abstractfactory.Model.color.Red;
import com.vikram.design.pattern.abstractfactory.Model.color.White;

public class ColorFactory implements AbstractFactory<Color>{

	public Color create(String colorType) {
		if ("Black".equalsIgnoreCase(colorType)) {
            return new Black();
        } else if ("Red".equalsIgnoreCase(colorType)) {
            return new Red();
        }else if ("White".equalsIgnoreCase(colorType)) {
            return new White();
        }
		return null;
	}

}
