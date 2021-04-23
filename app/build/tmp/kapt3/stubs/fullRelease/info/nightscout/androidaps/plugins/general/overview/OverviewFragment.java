package info.nightscout.androidaps.plugins.general.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008c\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u00cf\u0001\u001a\u00030\u00d0\u00012\b\u0010\u00d1\u0001\u001a\u00030\u00d2\u0001H\u0016J\n\u0010\u00d3\u0001\u001a\u00030\u00d0\u0001H\u0002J.\u0010\u00d4\u0001\u001a\u0005\u0018\u00010\u00d2\u00012\b\u0010\u00d5\u0001\u001a\u00030\u00d6\u00012\n\u0010\u00d7\u0001\u001a\u0005\u0018\u00010\u00d8\u00012\n\u0010\u00d9\u0001\u001a\u0005\u0018\u00010\u00da\u0001H\u0016J\u0014\u0010\u00db\u0001\u001a\u00030\u00b0\u00012\b\u0010\u00d1\u0001\u001a\u00030\u00d2\u0001H\u0016J\n\u0010\u00dc\u0001\u001a\u00030\u00d0\u0001H\u0016J\n\u0010\u00dd\u0001\u001a\u00030\u00d0\u0001H\u0016J \u0010\u00de\u0001\u001a\u00030\u00d0\u00012\b\u0010\u00df\u0001\u001a\u00030\u00d2\u00012\n\u0010\u00d9\u0001\u001a\u0005\u0018\u00010\u00da\u0001H\u0016J\u0014\u0010\u00e0\u0001\u001a\u00030\u00d0\u00012\b\u0010\u00e1\u0001\u001a\u00030\u00e2\u0001H\u0002J\u0013\u0010\u00e3\u0001\u001a\u00030\u00d0\u00012\u0007\u0010\u00e4\u0001\u001a\u00020\u0018H\u0002J\n\u0010\u00e5\u0001\u001a\u00030\u00d0\u0001H\u0003J\u0014\u0010\u00e6\u0001\u001a\u00030\u00d0\u00012\b\u0010\u00e7\u0001\u001a\u00030\u00e2\u0001H\u0002J\u0014\u0010\u00e8\u0001\u001a\u00030\u00d0\u00012\b\u0010\u00e7\u0001\u001a\u00030\u00e2\u0001H\u0007JH\u0010\u00e9\u0001\u001a\u00030\u00d0\u00012\n\u0010\u00ea\u0001\u001a\u0005\u0018\u00010\u00eb\u00012\b\u0010\u00ec\u0001\u001a\u00030\u00b0\u00012\b\u0010\u00ed\u0001\u001a\u00030\u00ee\u00012\b\u0010\u00ef\u0001\u001a\u00030\u00ee\u00012\b\u0010\u00f0\u0001\u001a\u00030\u00f1\u00012\b\u0010\u00f2\u0001\u001a\u00030\u00f3\u0001H\u0002J\u0014\u0010\u00f4\u0001\u001a\u00030\u00d0\u00012\b\u0010\u00f5\u0001\u001a\u00030\u00f6\u0001H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\'\u001a\u00020(8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u00020.8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00103\u001a\u0002048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u00109\u001a\u00020:8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010?\u001a\u00020@8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001e\u0010E\u001a\u00020F8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001e\u0010K\u001a\u00020L8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u000e\u0010Q\u001a\u00020RX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020TX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010U\u001a\u00020V8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u000e\u0010[\u001a\u00020\\X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010]\u001a\u00020^8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001e\u0010c\u001a\u00020d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u000e\u0010i\u001a\u00020jX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010k\u001a\u00020l8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001e\u0010q\u001a\u00020r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001e\u0010w\u001a\u00020x8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R!\u0010}\u001a\u00020~8\u0006@\u0006X\u0087.\u00a2\u0006\u0011\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R$\u0010\u0083\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R$\u0010\u0089\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R$\u0010\u008f\u0001\u001a\u00030\u0090\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R\u000f\u0010\u0095\u0001\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0097\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0098\u0001\u001a\u00030\u0099\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R$\u0010\u009e\u0001\u001a\u00030\u009f\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a0\u0001\u0010\u00a1\u0001\"\u0006\b\u00a2\u0001\u0010\u00a3\u0001R\u0017\u0010\u00a4\u0001\u001a\n\u0012\u0005\u0012\u00030\u00a6\u00010\u00a5\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u00a7\u0001\u001a\n\u0012\u0005\u0012\u00030\u00a8\u00010\u00a5\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u00a9\u0001\u001a\u00030\u00aa\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ab\u0001\u0010\u00ac\u0001\"\u0006\b\u00ad\u0001\u0010\u00ae\u0001R\u0010\u0010\u00af\u0001\u001a\u00030\u00b0\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u00b1\u0001\u001a\u00030\u00b0\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u00b2\u0001\u001a\u00030\u00b3\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b4\u0001\u0010\u00b5\u0001\"\u0006\b\u00b6\u0001\u0010\u00b7\u0001R$\u0010\u00b8\u0001\u001a\u00030\u00b9\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ba\u0001\u0010\u00bb\u0001\"\u0006\b\u00bc\u0001\u0010\u00bd\u0001R\"\u0010\u00be\u0001\u001a\u0005\u0018\u00010\u0097\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00bf\u0001\u0010\u00c0\u0001\"\u0006\b\u00c1\u0001\u0010\u00c2\u0001R$\u0010\u00c3\u0001\u001a\u00030\u00c4\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00c5\u0001\u0010\u00c6\u0001\"\u0006\b\u00c7\u0001\u0010\u00c8\u0001R$\u0010\u00c9\u0001\u001a\u00030\u00ca\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00cb\u0001\u0010\u00cc\u0001\"\u0006\b\u00cd\u0001\u0010\u00ce\u0001\u00a8\u0006\u00f7\u0001"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/overview/OverviewFragment;", "Ldagger/android/support/DaggerFragment;", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnLongClickListener;", "()V", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "getAapsLogger", "()Linfo/nightscout/androidaps/logging/AAPSLogger;", "setAapsLogger", "(Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "actionStringHandler", "Linfo/nightscout/androidaps/plugins/general/wear/ActionStringHandler;", "getActionStringHandler", "()Linfo/nightscout/androidaps/plugins/general/wear/ActionStringHandler;", "setActionStringHandler", "(Linfo/nightscout/androidaps/plugins/general/wear/ActionStringHandler;)V", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "getActivePlugin", "()Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "setActivePlugin", "(Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;)V", "axisWidth", "", "buildHelper", "Linfo/nightscout/androidaps/utils/buildHelper/BuildHelper;", "getBuildHelper", "()Linfo/nightscout/androidaps/utils/buildHelper/BuildHelper;", "setBuildHelper", "(Linfo/nightscout/androidaps/utils/buildHelper/BuildHelper;)V", "carbAnimation", "Landroid/graphics/drawable/AnimationDrawable;", "commandQueue", "Linfo/nightscout/androidaps/queue/CommandQueue;", "getCommandQueue", "()Linfo/nightscout/androidaps/queue/CommandQueue;", "setCommandQueue", "(Linfo/nightscout/androidaps/queue/CommandQueue;)V", "config", "Linfo/nightscout/androidaps/Config;", "getConfig", "()Linfo/nightscout/androidaps/Config;", "setConfig", "(Linfo/nightscout/androidaps/Config;)V", "configBuilderPlugin", "Linfo/nightscout/androidaps/plugins/configBuilder/ConfigBuilderPlugin;", "getConfigBuilderPlugin", "()Linfo/nightscout/androidaps/plugins/configBuilder/ConfigBuilderPlugin;", "setConfigBuilderPlugin", "(Linfo/nightscout/androidaps/plugins/configBuilder/ConfigBuilderPlugin;)V", "constraintChecker", "Linfo/nightscout/androidaps/plugins/configBuilder/ConstraintChecker;", "getConstraintChecker", "()Linfo/nightscout/androidaps/plugins/configBuilder/ConstraintChecker;", "setConstraintChecker", "(Linfo/nightscout/androidaps/plugins/configBuilder/ConstraintChecker;)V", "databaseHelper", "Linfo/nightscout/androidaps/interfaces/DatabaseHelperInterface;", "getDatabaseHelper", "()Linfo/nightscout/androidaps/interfaces/DatabaseHelperInterface;", "setDatabaseHelper", "(Linfo/nightscout/androidaps/interfaces/DatabaseHelperInterface;)V", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "getDateUtil", "()Linfo/nightscout/androidaps/utils/DateUtil;", "setDateUtil", "(Linfo/nightscout/androidaps/utils/DateUtil;)V", "defaultValueHelper", "Linfo/nightscout/androidaps/utils/DefaultValueHelper;", "getDefaultValueHelper", "()Linfo/nightscout/androidaps/utils/DefaultValueHelper;", "setDefaultValueHelper", "(Linfo/nightscout/androidaps/utils/DefaultValueHelper;)V", "dexcomPlugin", "Linfo/nightscout/androidaps/plugins/source/DexcomPlugin;", "getDexcomPlugin", "()Linfo/nightscout/androidaps/plugins/source/DexcomPlugin;", "setDexcomPlugin", "(Linfo/nightscout/androidaps/plugins/source/DexcomPlugin;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "dm", "Landroid/util/DisplayMetrics;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "getFabricPrivacy", "()Linfo/nightscout/androidaps/utils/FabricPrivacy;", "setFabricPrivacy", "(Linfo/nightscout/androidaps/utils/FabricPrivacy;)V", "graphLock", "Ljava/lang/Object;", "injector", "Ldagger/android/HasAndroidInjector;", "getInjector", "()Ldagger/android/HasAndroidInjector;", "setInjector", "(Ldagger/android/HasAndroidInjector;)V", "iobCobCalculatorPlugin", "Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;", "getIobCobCalculatorPlugin", "()Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;", "setIobCobCalculatorPlugin", "(Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;)V", "loopHandler", "Landroid/os/Handler;", "loopPlugin", "Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;", "getLoopPlugin", "()Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;", "setLoopPlugin", "(Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;)V", "notificationStore", "Linfo/nightscout/androidaps/plugins/general/overview/notifications/NotificationStore;", "getNotificationStore", "()Linfo/nightscout/androidaps/plugins/general/overview/notifications/NotificationStore;", "setNotificationStore", "(Linfo/nightscout/androidaps/plugins/general/overview/notifications/NotificationStore;)V", "nsDeviceStatus", "Linfo/nightscout/androidaps/plugins/general/nsclient/data/NSDeviceStatus;", "getNsDeviceStatus", "()Linfo/nightscout/androidaps/plugins/general/nsclient/data/NSDeviceStatus;", "setNsDeviceStatus", "(Linfo/nightscout/androidaps/plugins/general/nsclient/data/NSDeviceStatus;)V", "overviewMenus", "Linfo/nightscout/androidaps/plugins/general/overview/OverviewMenus;", "getOverviewMenus", "()Linfo/nightscout/androidaps/plugins/general/overview/OverviewMenus;", "setOverviewMenus", "(Linfo/nightscout/androidaps/plugins/general/overview/OverviewMenus;)V", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "getProfileFunction", "()Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "setProfileFunction", "(Linfo/nightscout/androidaps/interfaces/ProfileFunction;)V", "protectionCheck", "Linfo/nightscout/androidaps/utils/protection/ProtectionCheck;", "getProtectionCheck", "()Linfo/nightscout/androidaps/utils/protection/ProtectionCheck;", "setProtectionCheck", "(Linfo/nightscout/androidaps/utils/protection/ProtectionCheck;)V", "quickWizard", "Linfo/nightscout/androidaps/utils/wizard/QuickWizard;", "getQuickWizard", "()Linfo/nightscout/androidaps/utils/wizard/QuickWizard;", "setQuickWizard", "(Linfo/nightscout/androidaps/utils/wizard/QuickWizard;)V", "rangeToDisplay", "refreshLoop", "Ljava/lang/Runnable;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "setResourceHelper", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "getRxBus", "()Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "setRxBus", "(Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;)V", "secondaryGraphs", "Ljava/util/ArrayList;", "Lcom/jjoe64/graphview/GraphView;", "secondaryGraphsLabel", "Landroid/widget/TextView;", "skinProvider", "Linfo/nightscout/androidaps/skins/SkinProvider;", "getSkinProvider", "()Linfo/nightscout/androidaps/skins/SkinProvider;", "setSkinProvider", "(Linfo/nightscout/androidaps/skins/SkinProvider;)V", "smallHeight", "", "smallWidth", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "getSp", "()Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "setSp", "(Linfo/nightscout/androidaps/utils/sharedPreferences/SP;)V", "statusLightHandler", "Linfo/nightscout/androidaps/plugins/general/overview/StatusLightHandler;", "getStatusLightHandler", "()Linfo/nightscout/androidaps/plugins/general/overview/StatusLightHandler;", "setStatusLightHandler", "(Linfo/nightscout/androidaps/plugins/general/overview/StatusLightHandler;)V", "task", "getTask", "()Ljava/lang/Runnable;", "setTask", "(Ljava/lang/Runnable;)V", "treatmentsPlugin", "Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;", "getTreatmentsPlugin", "()Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;", "setTreatmentsPlugin", "(Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;)V", "xdripPlugin", "Linfo/nightscout/androidaps/plugins/source/XdripPlugin;", "getXdripPlugin", "()Linfo/nightscout/androidaps/plugins/source/XdripPlugin;", "setXdripPlugin", "(Linfo/nightscout/androidaps/plugins/source/XdripPlugin;)V", "onClick", "", "v", "Landroid/view/View;", "onClickQuickWizard", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onLongClick", "onPause", "onResume", "onViewCreated", "view", "openCgmApp", "packageName", "", "prepareGraphsIfNeeded", "numOfGraphs", "processButtonsVisibility", "scheduleUpdateGUI", "from", "updateGUI", "updateGraph", "lastRun", "Linfo/nightscout/androidaps/interfaces/LoopInterface$LastRun;", "predictionsAvailable", "lowLine", "", "highLine", "pump", "Linfo/nightscout/androidaps/interfaces/PumpInterface;", "profile", "Linfo/nightscout/androidaps/data/Profile;", "updatePumpStatus", "event", "Linfo/nightscout/androidaps/events/EventPumpStatusChanged;", "app_fullRelease"})
public final class OverviewFragment extends dagger.android.support.DaggerFragment implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {
    @javax.inject.Inject()
    public dagger.android.HasAndroidInjector injector;
    @javax.inject.Inject()
    public info.nightscout.androidaps.logging.AAPSLogger aapsLogger;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.sharedPreferences.SP sp;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.DefaultValueHelper defaultValueHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ProfileFunction profileFunction;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker constraintChecker;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.overview.StatusLightHandler statusLightHandler;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.nsclient.data.NSDeviceStatus nsDeviceStatus;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.aps.loop.LoopPlugin loopPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.configBuilder.ConfigBuilderPlugin configBuilderPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin treatmentsPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin iobCobCalculatorPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.source.DexcomPlugin dexcomPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.source.XdripPlugin xdripPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.overview.notifications.NotificationStore notificationStore;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.wear.ActionStringHandler actionStringHandler;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.wizard.QuickWizard quickWizard;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.buildHelper.BuildHelper buildHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.queue.CommandQueue commandQueue;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.protection.ProtectionCheck protectionCheck;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.overview.OverviewMenus overviewMenus;
    @javax.inject.Inject()
    public info.nightscout.androidaps.skins.SkinProvider skinProvider;
    @javax.inject.Inject()
    public info.nightscout.androidaps.Config config;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.DateUtil dateUtil;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.DatabaseHelperInterface databaseHelper;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private boolean smallWidth = false;
    private boolean smallHeight = false;
    private android.util.DisplayMetrics dm;
    private int axisWidth = 0;
    private int rangeToDisplay = 6;
    private android.os.Handler loopHandler;
    private java.lang.Runnable refreshLoop;
    private final java.util.ArrayList<com.jjoe64.graphview.GraphView> secondaryGraphs = null;
    private final java.util.ArrayList<android.widget.TextView> secondaryGraphsLabel = null;
    private android.graphics.drawable.AnimationDrawable carbAnimation;
    private final java.lang.Object graphLock = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Runnable task;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.HasAndroidInjector getInjector() {
        return null;
    }
    
    public final void setInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.logging.AAPSLogger getAapsLogger() {
        return null;
    }
    
    public final void setAapsLogger(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.sharedPreferences.SP getSp() {
        return null;
    }
    
    public final void setSp(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.bus.RxBusWrapper getRxBus() {
        return null;
    }
    
    public final void setRxBus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.resources.ResourceHelper getResourceHelper() {
        return null;
    }
    
    public final void setResourceHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.DefaultValueHelper getDefaultValueHelper() {
        return null;
    }
    
    public final void setDefaultValueHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DefaultValueHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ProfileFunction getProfileFunction() {
        return null;
    }
    
    public final void setProfileFunction(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker getConstraintChecker() {
        return null;
    }
    
    public final void setConstraintChecker(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.overview.StatusLightHandler getStatusLightHandler() {
        return null;
    }
    
    public final void setStatusLightHandler(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.overview.StatusLightHandler p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.nsclient.data.NSDeviceStatus getNsDeviceStatus() {
        return null;
    }
    
    public final void setNsDeviceStatus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.nsclient.data.NSDeviceStatus p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.aps.loop.LoopPlugin getLoopPlugin() {
        return null;
    }
    
    public final void setLoopPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.aps.loop.LoopPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.configBuilder.ConfigBuilderPlugin getConfigBuilderPlugin() {
        return null;
    }
    
    public final void setConfigBuilderPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.configBuilder.ConfigBuilderPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ActivePluginProvider getActivePlugin() {
        return null;
    }
    
    public final void setActivePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin getTreatmentsPlugin() {
        return null;
    }
    
    public final void setTreatmentsPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin getIobCobCalculatorPlugin() {
        return null;
    }
    
    public final void setIobCobCalculatorPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.source.DexcomPlugin getDexcomPlugin() {
        return null;
    }
    
    public final void setDexcomPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.source.DexcomPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.source.XdripPlugin getXdripPlugin() {
        return null;
    }
    
    public final void setXdripPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.source.XdripPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.overview.notifications.NotificationStore getNotificationStore() {
        return null;
    }
    
    public final void setNotificationStore(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.overview.notifications.NotificationStore p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.wear.ActionStringHandler getActionStringHandler() {
        return null;
    }
    
    public final void setActionStringHandler(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.wear.ActionStringHandler p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.wizard.QuickWizard getQuickWizard() {
        return null;
    }
    
    public final void setQuickWizard(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.wizard.QuickWizard p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.buildHelper.BuildHelper getBuildHelper() {
        return null;
    }
    
    public final void setBuildHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.buildHelper.BuildHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.queue.CommandQueue getCommandQueue() {
        return null;
    }
    
    public final void setCommandQueue(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.queue.CommandQueue p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.protection.ProtectionCheck getProtectionCheck() {
        return null;
    }
    
    public final void setProtectionCheck(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.protection.ProtectionCheck p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.FabricPrivacy getFabricPrivacy() {
        return null;
    }
    
    public final void setFabricPrivacy(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.FabricPrivacy p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.overview.OverviewMenus getOverviewMenus() {
        return null;
    }
    
    public final void setOverviewMenus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.overview.OverviewMenus p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.skins.SkinProvider getSkinProvider() {
        return null;
    }
    
    public final void setSkinProvider(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.skins.SkinProvider p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.Config getConfig() {
        return null;
    }
    
    public final void setConfig(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.Config p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.DateUtil getDateUtil() {
        return null;
    }
    
    public final void setDateUtil(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.DatabaseHelperInterface getDatabaseHelper() {
        return null;
    }
    
    public final void setDatabaseHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.DatabaseHelperInterface p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    private final void openCgmApp(java.lang.String packageName) {
    }
    
    @java.lang.Override()
    public boolean onLongClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
        return false;
    }
    
    private final void onClickQuickWizard() {
    }
    
    private final void updatePumpStatus(info.nightscout.androidaps.events.EventPumpStatusChanged event) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void processButtonsVisibility() {
    }
    
    private final void prepareGraphsIfNeeded(int numOfGraphs) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Runnable getTask() {
        return null;
    }
    
    public final void setTask(@org.jetbrains.annotations.Nullable()
    java.lang.Runnable p0) {
    }
    
    private final void scheduleUpdateGUI(java.lang.String from) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public final void updateGUI(@org.jetbrains.annotations.NotNull()
    java.lang.String from) {
    }
    
    private final void updateGraph(info.nightscout.androidaps.interfaces.LoopInterface.LastRun lastRun, boolean predictionsAvailable, double lowLine, double highLine, info.nightscout.androidaps.interfaces.PumpInterface pump, info.nightscout.androidaps.data.Profile profile) {
    }
    
    public OverviewFragment() {
        super();
    }
}