package swaggerblocks.rendering.yaml

import internal.models._
import net.jcazevedo.moultingyaml._
import net.jcazevedo.moultingyaml.DefaultYamlProtocol._
import swaggerblocks._
import internal.propertyTypes.PropertyType
import internal.specModels._
import internal.writeLogic

//noinspection NotImplementedCode
object formats extends DefaultYamlProtocol {
  implicit val apiContact = yamlFormat3(ApiContact)

  implicit val apiLicense = yamlFormat2(ApiLicense)

  implicit val apiExternalDocs = yamlFormat2(ApiExternalDocs)

  implicit val apiInfo = yamlFormat6(ApiInfo)

  implicit val apiParameterIn = new YamlFormat[ParameterIn] {
    def write(obj: ParameterIn): YamlValue =
      YamlString(writeLogic.parameterInToString(obj))

    def read(yaml: YamlValue): ParameterIn = ???
  }

  // use format instead of writer to enable usage of 'yamlFormat2()' helper for ApiProperty
  implicit val apiPropertyType = new YamlFormat[PropertyType] {
    def write(obj: PropertyType): YamlValue =
      YamlString(writeLogic.propertyTypeToString(obj))

    def read(yaml: YamlValue): PropertyType = ???
  }

  implicit val specSchema: YamlFormat[SpecSchema] = lazyFormat(yamlFormat9(SpecSchema))

  implicit val specResponse = yamlFormat2(SpecResponse)

  implicit val specParameter = yamlFormat11(SpecParameter)

  implicit val specOperation = yamlFormat5(SpecOperation)

  implicit val spec = yamlFormat7(Spec)
}
