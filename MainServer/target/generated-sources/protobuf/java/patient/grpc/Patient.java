// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: patient.proto

package patient.grpc;

public final class Patient {
  private Patient() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DBresponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DBresponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rpatient.proto\"%\n\016bookingRequest\022\023\n\013dat" +
      "eAndTime\030\001 \001(\t\"\"\n\nDBresponse\022\024\n\014confirma" +
      "tion\030\001 \001(\t2C\n\016PatientBooking\0221\n\017bookAppo" +
      "intment\022\017.bookingRequest\032\013.DBresponse\"\000B" +
      "\020\n\014patient.grpcP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_bookingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bookingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookingRequest_descriptor,
        new java.lang.String[] { "DateAndTime", });
    internal_static_DBresponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_DBresponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DBresponse_descriptor,
        new java.lang.String[] { "Confirmation", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
