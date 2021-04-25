// Generated by view binder compiler. Do not edit!
package info.nightscout.androidaps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import info.nightscout.androidaps.R;
import info.nightscout.androidaps.utils.ui.SingleClickButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySmscommunicatorOtpBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final SingleClickButton actionsSmscommunicatorOtpReset;

  @NonNull
  public final LinearLayout smscommunicatorOtpLayout;

  @NonNull
  public final ImageView smscommunicatorOtpProvisioning;

  @NonNull
  public final EditText smscommunicatorOtpVerifyEdit;

  @NonNull
  public final TextView smscommunicatorOtpVerifyLabel;

  private ActivitySmscommunicatorOtpBinding(@NonNull FrameLayout rootView,
      @NonNull SingleClickButton actionsSmscommunicatorOtpReset,
      @NonNull LinearLayout smscommunicatorOtpLayout,
      @NonNull ImageView smscommunicatorOtpProvisioning,
      @NonNull EditText smscommunicatorOtpVerifyEdit,
      @NonNull TextView smscommunicatorOtpVerifyLabel) {
    this.rootView = rootView;
    this.actionsSmscommunicatorOtpReset = actionsSmscommunicatorOtpReset;
    this.smscommunicatorOtpLayout = smscommunicatorOtpLayout;
    this.smscommunicatorOtpProvisioning = smscommunicatorOtpProvisioning;
    this.smscommunicatorOtpVerifyEdit = smscommunicatorOtpVerifyEdit;
    this.smscommunicatorOtpVerifyLabel = smscommunicatorOtpVerifyLabel;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySmscommunicatorOtpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySmscommunicatorOtpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_smscommunicator_otp, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySmscommunicatorOtpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.actions_smscommunicator_otp_reset;
      SingleClickButton actionsSmscommunicatorOtpReset = rootView.findViewById(id);
      if (actionsSmscommunicatorOtpReset == null) {
        break missingId;
      }

      id = R.id.smscommunicator_otp_layout;
      LinearLayout smscommunicatorOtpLayout = rootView.findViewById(id);
      if (smscommunicatorOtpLayout == null) {
        break missingId;
      }

      id = R.id.smscommunicator_otp_provisioning;
      ImageView smscommunicatorOtpProvisioning = rootView.findViewById(id);
      if (smscommunicatorOtpProvisioning == null) {
        break missingId;
      }

      id = R.id.smscommunicator_otp_verify_edit;
      EditText smscommunicatorOtpVerifyEdit = rootView.findViewById(id);
      if (smscommunicatorOtpVerifyEdit == null) {
        break missingId;
      }

      id = R.id.smscommunicator_otp_verify_label;
      TextView smscommunicatorOtpVerifyLabel = rootView.findViewById(id);
      if (smscommunicatorOtpVerifyLabel == null) {
        break missingId;
      }

      return new ActivitySmscommunicatorOtpBinding((FrameLayout) rootView,
          actionsSmscommunicatorOtpReset, smscommunicatorOtpLayout, smscommunicatorOtpProvisioning,
          smscommunicatorOtpVerifyEdit, smscommunicatorOtpVerifyLabel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}