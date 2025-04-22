package com.example.myapp.presentation.main;

import com.example.myapp.data.local.dao.UserDao;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<UserDao> userDaoProvider;

  public MainActivity_MembersInjector(Provider<UserDao> userDaoProvider) {
    this.userDaoProvider = userDaoProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<UserDao> userDaoProvider) {
    return new MainActivity_MembersInjector(userDaoProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectUserDao(instance, userDaoProvider.get());
  }

  @InjectedFieldSignature("com.example.myapp.presentation.main.MainActivity.userDao")
  public static void injectUserDao(MainActivity instance, UserDao userDao) {
    instance.userDao = userDao;
  }
}
