// Generated by view binder compiler. Do not edit!
package com.example.projeto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
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

public final class ActivityMeuPerfilBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final EditText Email;

  @NonNull
  public final TextView createText;

  @NonNull
  public final ImageButton imageButton12;

  @NonNull
  public final Button loginBtn;

  @NonNull
  public final ScrollView mainScroll;

  @NonNull
  public final EditText password;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView textView15;

  private ActivityMeuPerfilBinding(@NonNull RelativeLayout rootView, @NonNull EditText Email,
      @NonNull TextView createText, @NonNull ImageButton imageButton12, @NonNull Button loginBtn,
      @NonNull ScrollView mainScroll, @NonNull EditText password, @NonNull ProgressBar progressBar,
      @NonNull TextView textView15) {
    this.rootView = rootView;
    this.Email = Email;
    this.createText = createText;
    this.imageButton12 = imageButton12;
    this.loginBtn = loginBtn;
    this.mainScroll = mainScroll;
    this.password = password;
    this.progressBar = progressBar;
    this.textView15 = textView15;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMeuPerfilBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMeuPerfilBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_meu_perfil, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMeuPerfilBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Email;
      EditText Email = ViewBindings.findChildViewById(rootView, id);
      if (Email == null) {
        break missingId;
      }

      id = R.id.createText;
      TextView createText = ViewBindings.findChildViewById(rootView, id);
      if (createText == null) {
        break missingId;
      }

      id = R.id.imageButton12;
      ImageButton imageButton12 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton12 == null) {
        break missingId;
      }

      id = R.id.loginBtn;
      Button loginBtn = ViewBindings.findChildViewById(rootView, id);
      if (loginBtn == null) {
        break missingId;
      }

      id = R.id.mainScroll;
      ScrollView mainScroll = ViewBindings.findChildViewById(rootView, id);
      if (mainScroll == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.textView15;
      TextView textView15 = ViewBindings.findChildViewById(rootView, id);
      if (textView15 == null) {
        break missingId;
      }

      return new ActivityMeuPerfilBinding((RelativeLayout) rootView, Email, createText,
          imageButton12, loginBtn, mainScroll, password, progressBar, textView15);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
