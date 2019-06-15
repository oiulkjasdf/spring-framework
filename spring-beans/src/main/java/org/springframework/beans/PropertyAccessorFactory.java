/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.beans;

/**
 * Simple factory facade for obtaining {@link PropertyAccessor} instances,
 * in particular for {@link BeanWrapper} instances. Conceals the actual
 * target implementation classes and their extended public signature.
 *
 * @author Juergen Hoeller
 * @since 2.5.2
 */


/*final  类 属性存取器工厂 */
public final class PropertyAccessorFactory {

	/*构造*/
	private PropertyAccessorFactory() {
	}


	/**
	 * Obtain a BeanWrapper for the given target object,
	 * accessing properties in JavaBeans style.
	 * @param target the target object to wrap
	 * @return the property accessor
	 * @see BeanWrapperImpl
	 */
	/*bean 中 的允许存取的 方法*/
	public static org.springframework.beans.BeanWrapper forBeanPropertyAccess(Object target) {
		/*去这个对象中  构造了*/
		return new org.springframework.beans.BeanWrapperImpl(target);
	}

	/**
	 * Obtain a PropertyAccessor for the given target object,
	 * accessing properties in direct field style.
	 * @param target the target object to wrap
	 * @return the property accessor
	 * @see DirectFieldAccessor
	 */
	/*直接允许的属性*/
	public static org.springframework.beans.ConfigurablePropertyAccessor forDirectFieldAccess(Object target) {
		/*去另一个对象中 构造了*/
		return new org.springframework.beans.DirectFieldAccessor(target);
	}

}
