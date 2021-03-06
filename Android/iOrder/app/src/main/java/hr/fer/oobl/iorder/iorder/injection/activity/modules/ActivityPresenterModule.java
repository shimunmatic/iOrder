package hr.fer.oobl.iorder.iorder.injection.activity.modules;

import dagger.Module;
import dagger.Provides;
import hr.fer.oobl.iorder.iorder.injection.activity.ActivityScope;
import hr.fer.oobl.iorder.iorder.injection.activity.DaggerActivity;
import hr.fer.oobl.iorder.iorder.injection.fragment.FragmentScope;
import hr.fer.oobl.iorder.iorder.ui.history.HistoryContract;
import hr.fer.oobl.iorder.iorder.ui.history.HistoryPresenter;
import hr.fer.oobl.iorder.iorder.ui.login.LoginContract;
import hr.fer.oobl.iorder.iorder.ui.login.LoginPresenter;
import hr.fer.oobl.iorder.iorder.ui.main.MainContract;
import hr.fer.oobl.iorder.iorder.ui.main.MainPresenter;
import hr.fer.oobl.iorder.iorder.ui.scanner.ScannerContract;
import hr.fer.oobl.iorder.iorder.ui.scanner.ScannerPresenter;
import hr.fer.oobl.iorder.iorder.ui.signup.SignupContract;
import hr.fer.oobl.iorder.iorder.ui.signup.SignupPresenter;

@Module
public final class ActivityPresenterModule {

    private final DaggerActivity daggerActivity;

    public ActivityPresenterModule(final DaggerActivity daggerActivity) {
        this.daggerActivity = daggerActivity;
    }

    @Provides
    @ActivityScope
    LoginContract.Presenter provideLoginPresenter() {
        final LoginPresenter presenter = new LoginPresenter((LoginContract.View) daggerActivity);
        daggerActivity.getActivityComponent().inject(presenter);
        return presenter;
    }

    @Provides
    @ActivityScope
    SignupContract.Presenter provideSignUpPresenter() {
        final SignupPresenter presenter = new SignupPresenter((SignupContract.View) daggerActivity);
        daggerActivity.getActivityComponent().inject(presenter);
        return presenter;
    }

    @Provides
    @ActivityScope
    MainContract.Presenter provideMainPresenter() {
        final MainPresenter presenter = new MainPresenter((MainContract.View) daggerActivity);
        daggerActivity.getActivityComponent().inject(presenter);
        return presenter;
    }


    @Provides
    @ActivityScope
    HistoryContract.Presenter provideHistoryPresenter() {
        final HistoryPresenter presenter = new HistoryPresenter((HistoryContract.View) daggerActivity);
        daggerActivity.getActivityComponent().inject(presenter);
        return presenter;
    }

    @Provides
    @ActivityScope
    ScannerContract.Presenter provideScannerPresenter() {
        final ScannerPresenter presenter = new ScannerPresenter((ScannerContract.View) daggerActivity);
        daggerActivity.getActivityComponent().inject(presenter);
        return presenter;
    }
}
