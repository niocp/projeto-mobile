// Generated by view binder compiler. Do not edit!
package com.example.projeto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.projeto.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEfetuarCompraBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button button6;

  @NonNull
  public final ImageButton imageButton15;

  @NonNull
  public final ScrollView mainScroll;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView26;

  @NonNull
  public final TextView textView27;

  @NonNull
  public final TextView textView29;

  @NonNull
  public final TextView textView30;

  private ActivityEfetuarCompraBinding(@NonNull RelativeLayout rootView, @NonNull Button button6,
      @NonNull ImageButton imageButton15, @NonNull ScrollView mainScroll,
      @NonNull TextView textView, @NonNull TextView textView26, @NonNull TextView textView27,
      @NonNull TextView textView29, @NonNull TextView textView30) {
    this.rootView = rootView;
    this.button6 = button6;
    this.imageButton15 = imageButton15;
    this.mainScroll = mainScroll;
    this.textView = textView;
    this.textView26 = textView26;
    this.textView27 = textView27;
    this.textView29 = textView29;
    this.textView30 = textView30;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEfetuarCompraBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEfetuarCompraBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_efetuar_compra, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEfetuarCompraBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button6;
      Button button6 = ViewBindings.findChildViewById(rootView, id);
      if (button6 == null) {
        break missingId;
      }

      id = R.id.imageButton15;
      ImageButton imageButton15 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton15 == null) {
        break missingId;
      }

      id = R.id.mainScroll;
      ScrollView mainScroll = ViewBindings.findChildViewById(rootView, id);
      if (mainScroll == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView26;
      TextView textView26 = ViewBindings.findChildViewById(rootView, id);
      if (textView26 == null) {
        break missingId;
      }

      id = R.id.textView27;
      TextView textView27 = ViewBindings.findChildViewById(rootView, id);
      if (textView27 == null) {
        break missingId;
      }

      id = R.id.textView29;
      TextView textView29 = ViewBindings.findChildViewById(rootView, id);
      if (textView29 == null) {
        break missingId;
      }

      id = R.id.textView30;
      TextView textView30 = ViewBindings.findChildViewById(rootView, id);
      if (textView30 == null) {
        break missingId;
      }

      return new ActivityEfetuarCompraBinding((RelativeLayout) rootView, button6, imageButton15,
          mainScroll, textView, textView26, textView27, textView29, textView30);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}