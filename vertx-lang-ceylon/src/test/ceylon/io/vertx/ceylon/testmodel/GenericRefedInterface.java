package io.vertx.ceylon.testmodel;

import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import com.redhat.ceylon.compiler.java.runtime.model.ReifiedType;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE)
})
@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "")
public class GenericRefedInterface<T> implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.GenericRefedInterface, GenericRefedInterface> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.GenericRefedInterface, GenericRefedInterface>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.GenericRefedInterface, GenericRefedInterface> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.GenericRefedInterface, GenericRefedInterface>() {
        public GenericRefedInterface convert(io.vertx.codegen.testmodel.GenericRefedInterface src) {
          return new GenericRefedInterface(descriptors[0], src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<GenericRefedInterface, io.vertx.codegen.testmodel.GenericRefedInterface> TO_JAVA = new io.vertx.lang.ceylon.Converter<GenericRefedInterface, io.vertx.codegen.testmodel.GenericRefedInterface>() {
    public io.vertx.codegen.testmodel.GenericRefedInterface convert(GenericRefedInterface src) {
      return src.delegate;
    }
  };

  @Ignore private final TypeDescriptor $TypeDescriptor$;
  @Ignore private final TypeDescriptor $reified$T;
  @Ignore private final io.vertx.codegen.testmodel.GenericRefedInterface delegate;

  public GenericRefedInterface(@Ignore TypeDescriptor $reified$T, io.vertx.codegen.testmodel.GenericRefedInterface delegate) {
    this.$TypeDescriptor$ = TypeDescriptor.klass(GenericRefedInterface.class, $reified$T);
    this.$reified$T = $reified$T;
    this.delegate = delegate;
  }

  @Ignore 
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<T>")
  public GenericRefedInterface<T> setValue(
    final @TypeInfo("T") @Name("value") T value) {
    java.lang.Object arg_0 = (T)io.vertx.lang.ceylon.VertxTypeDescriptor.getToJava($reified$T).convert(value);
    GenericRefedInterface<T> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter($reified$T).safeConvert(delegate.setValue(arg_0));
    return this;
  }

  @TypeInfo("T")
  public T $getValue() {
    T ret = (T)io.vertx.lang.ceylon.VertxTypeDescriptor.getToCeylon($reified$T).convert(delegate.getValue());
    return ret;
  }

}
