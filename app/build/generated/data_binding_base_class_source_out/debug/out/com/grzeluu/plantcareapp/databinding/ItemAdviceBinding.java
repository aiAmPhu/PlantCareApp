// Generated by view binder compiler. Do not edit!
package com.grzeluu.plantcareapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.grzeluu.plantcareapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemAdviceBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView ivVerified;

  @NonNull
  public final TextView tvAnswer;

  @NonNull
  public final TextView tvQuestion;

  private ItemAdviceBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ivVerified,
      @NonNull TextView tvAnswer, @NonNull TextView tvQuestion) {
    this.rootView = rootView;
    this.ivVerified = ivVerified;
    this.tvAnswer = tvAnswer;
    this.tvQuestion = tvQuestion;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemAdviceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemAdviceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_advice, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemAdviceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_verified;
      ImageView ivVerified = ViewBindings.findChildViewById(rootView, id);
      if (ivVerified == null) {
        break missingId;
      }

      id = R.id.tv_answer;
      TextView tvAnswer = ViewBindings.findChildViewById(rootView, id);
      if (tvAnswer == null) {
        break missingId;
      }

      id = R.id.tv_question;
      TextView tvQuestion = ViewBindings.findChildViewById(rootView, id);
      if (tvQuestion == null) {
        break missingId;
      }

      return new ItemAdviceBinding((ConstraintLayout) rootView, ivVerified, tvAnswer, tvQuestion);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
