// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CasesService.proto

package gr;

public final class CasesServiceOuterClass {
  private CasesServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(gr.CasesServiceOuterClass.name);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int NAME_FIELD_NUMBER = 51234;
  /**
   * <code>extend .google.protobuf.EnumValueOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.EnumValueOptions,
      java.lang.String> name = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gr_request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gr_request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gr_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gr_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022CasesService.proto\022\002gr\032 google/protobu" +
      "f/descriptor.proto\"+\n\007request\022 \n\tcasesTy" +
      "pe\030\001 \001(\0162\r.gr.CasesEnum\"\007\n\005Empty*_\n\tCase" +
      "sEnum\022\034\n\tCONFIRMED\020\000\032\r\222\202\031\tCONFIRMED\022\026\n\006D" +
      "EATHS\020\001\032\n\222\202\031\006DEATHS\022\034\n\tRECOVERED\020\002\032\r\222\202\031\t" +
      "RECOVERED2<\n\014CasesService\022,\n\020collectCase" +
      "sData\022\013.gr.request\032\t.gr.Empty\"\000:4\n\004name\022" +
      "!.google.protobuf.EnumValueOptions\030\242\220\003 \001" +
      "(\t\210\001\001B\006\n\002grP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    internal_static_gr_request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gr_request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gr_request_descriptor,
        new java.lang.String[] { "CasesType", });
    internal_static_gr_Empty_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_gr_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gr_Empty_descriptor,
        new java.lang.String[] { });
    name.internalInit(descriptor.getExtensions().get(0));
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(gr.CasesServiceOuterClass.name);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}