package info.nightscout.androidaps.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00fc\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J!\u0010\u00e6\u0001\u001a\u00030\u00e7\u00012\n\b\u0001\u0010\u00e8\u0001\u001a\u00030\u0085\u00012\t\u0010\u00e9\u0001\u001a\u0004\u0018\u00010;H\u0003J+\u0010\u00e6\u0001\u001a\u00030\u00e7\u00012\n\b\u0001\u0010\u00e8\u0001\u001a\u00030\u0085\u00012\t\u0010\u00e9\u0001\u001a\u0004\u0018\u00010;2\b\u0010\u00ea\u0001\u001a\u00030\u00eb\u0001H\u0002J!\u0010\u00ec\u0001\u001a\u00030\u00e7\u00012\n\u0010\u00ed\u0001\u001a\u0005\u0018\u00010\u00ee\u00012\t\u0010\u00ef\u0001\u001a\u0004\u0018\u00010;H\u0002J+\u0010\u00ec\u0001\u001a\u00030\u00e7\u00012\n\u0010\u00ed\u0001\u001a\u0005\u0018\u00010\u00ee\u00012\t\u0010\u00ef\u0001\u001a\u0004\u0018\u00010;2\b\u0010\u00ea\u0001\u001a\u00030\u00eb\u0001H\u0002J\u0014\u0010\u00f0\u0001\u001a\u00030\u00e7\u00012\b\u0010\u00f1\u0001\u001a\u00030\u00f2\u0001H\u0002J\u0013\u0010\u00f3\u0001\u001a\u00030\u00e7\u00012\u0007\u0010\u00e9\u0001\u001a\u00020;H\u0002J\u001e\u0010\u00f4\u0001\u001a\u00030\u00e7\u00012\b\u0010\u00ed\u0001\u001a\u00030\u00f2\u00012\b\u0010\u00f5\u0001\u001a\u00030\u00eb\u0001H\u0002J\u0014\u0010\u00f6\u0001\u001a\u00030\u00e7\u00012\b\u0010\u00f7\u0001\u001a\u00030\u00f8\u0001H\u0016J\u0016\u0010\u00f9\u0001\u001a\u00030\u00e7\u00012\n\u0010\u00fa\u0001\u001a\u0005\u0018\u00010\u00fb\u0001H\u0016J!\u0010\u00fc\u0001\u001a\u00030\u00e7\u00012\n\u0010\u00fa\u0001\u001a\u0005\u0018\u00010\u00fb\u00012\t\u0010\u00ef\u0001\u001a\u0004\u0018\u00010;H\u0016J\n\u0010\u00fd\u0001\u001a\u00030\u00e7\u0001H\u0016J\u0016\u0010\u00fe\u0001\u001a\u00030\u00eb\u00012\n\u0010\u00ff\u0001\u001a\u0005\u0018\u00010\u00f2\u0001H\u0016J\u0014\u0010\u0080\u0002\u001a\u00030\u00e7\u00012\b\u0010\u0081\u0002\u001a\u00030\u00fb\u0001H\u0016J\u001d\u0010\u0082\u0002\u001a\u00030\u00e7\u00012\b\u0010\u0083\u0002\u001a\u00030\u0084\u00022\u0007\u0010\u00e9\u0001\u001a\u00020;H\u0016J\n\u0010\u0085\u0002\u001a\u00030\u00e7\u0001H\u0002J\u0016\u0010\u0086\u0002\u001a\u00030\u00e7\u00012\n\u0010\u0087\u0002\u001a\u0005\u0018\u00010\u00fb\u0001H\u0016J\u0010\u0010\u0088\u0002\u001a\u00030\u00e7\u00012\u0006\u0010:\u001a\u00020;J\u001c\u0010\u0089\u0002\u001a\u00030\u00eb\u00012\u0006\u0010:\u001a\u00020;2\b\u0010\u00ed\u0001\u001a\u00030\u00f2\u0001H\u0002J\u0016\u0010\u008a\u0002\u001a\u00030\u00e7\u00012\n\u0010\u00f1\u0001\u001a\u0005\u0018\u00010\u00f2\u0001H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010.\u001a\u00020/8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u00104\u001a\u0002058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u000e\u0010:\u001a\u00020;X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010<\u001a\u00020=8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010B\u001a\u00020C8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001e\u0010H\u001a\u00020I8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001e\u0010N\u001a\u00020O8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001e\u0010T\u001a\u00020U8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001e\u0010Z\u001a\u00020[8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001e\u0010`\u001a\u00020a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001e\u0010f\u001a\u00020g8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001e\u0010l\u001a\u00020m8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001e\u0010r\u001a\u00020s8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u001e\u0010x\u001a\u00020y8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\"\u0010~\u001a\u00020\u007f8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0010\u0010\u0084\u0001\u001a\u00030\u0085\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0086\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R$\u0010\u008c\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R$\u0010\u0092\u0001\u001a\u00030\u0093\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R$\u0010\u0098\u0001\u001a\u00030\u0099\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R$\u0010\u009e\u0001\u001a\u00030\u009f\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a0\u0001\u0010\u00a1\u0001\"\u0006\b\u00a2\u0001\u0010\u00a3\u0001R$\u0010\u00a4\u0001\u001a\u00030\u00a5\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a6\u0001\u0010\u00a7\u0001\"\u0006\b\u00a8\u0001\u0010\u00a9\u0001R$\u0010\u00aa\u0001\u001a\u00030\u00ab\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ac\u0001\u0010\u00ad\u0001\"\u0006\b\u00ae\u0001\u0010\u00af\u0001R$\u0010\u00b0\u0001\u001a\u00030\u00b1\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b2\u0001\u0010\u00b3\u0001\"\u0006\b\u00b4\u0001\u0010\u00b5\u0001R$\u0010\u00b6\u0001\u001a\u00030\u00b7\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b8\u0001\u0010\u00b9\u0001\"\u0006\b\u00ba\u0001\u0010\u00bb\u0001R$\u0010\u00bc\u0001\u001a\u00030\u00bd\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00be\u0001\u0010\u00bf\u0001\"\u0006\b\u00c0\u0001\u0010\u00c1\u0001R$\u0010\u00c2\u0001\u001a\u00030\u00c3\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00c4\u0001\u0010\u00c5\u0001\"\u0006\b\u00c6\u0001\u0010\u00c7\u0001R$\u0010\u00c8\u0001\u001a\u00030\u00c9\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ca\u0001\u0010\u00cb\u0001\"\u0006\b\u00cc\u0001\u0010\u00cd\u0001R$\u0010\u00ce\u0001\u001a\u00030\u00cf\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00d0\u0001\u0010\u00d1\u0001\"\u0006\b\u00d2\u0001\u0010\u00d3\u0001R$\u0010\u00d4\u0001\u001a\u00030\u00d5\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00d6\u0001\u0010\u00d7\u0001\"\u0006\b\u00d8\u0001\u0010\u00d9\u0001R$\u0010\u00da\u0001\u001a\u00030\u00db\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00dc\u0001\u0010\u00dd\u0001\"\u0006\b\u00de\u0001\u0010\u00df\u0001R$\u0010\u00e0\u0001\u001a\u00030\u00e1\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00e2\u0001\u0010\u00e3\u0001\"\u0006\b\u00e4\u0001\u0010\u00e5\u0001\u00a8\u0006\u008b\u0002"}, d2 = {"Linfo/nightscout/androidaps/activities/MyPreferenceFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "automationPlugin", "Linfo/nightscout/androidaps/plugins/general/automation/AutomationPlugin;", "getAutomationPlugin", "()Linfo/nightscout/androidaps/plugins/general/automation/AutomationPlugin;", "setAutomationPlugin", "(Linfo/nightscout/androidaps/plugins/general/automation/AutomationPlugin;)V", "comboPlugin", "Linfo/nightscout/androidaps/plugins/pump/combo/ComboPlugin;", "getComboPlugin", "()Linfo/nightscout/androidaps/plugins/pump/combo/ComboPlugin;", "setComboPlugin", "(Linfo/nightscout/androidaps/plugins/pump/combo/ComboPlugin;)V", "config", "Linfo/nightscout/androidaps/Config;", "getConfig", "()Linfo/nightscout/androidaps/Config;", "setConfig", "(Linfo/nightscout/androidaps/Config;)V", "danaRKoreanPlugin", "Linfo/nightscout/androidaps/danaRKorean/DanaRKoreanPlugin;", "getDanaRKoreanPlugin", "()Linfo/nightscout/androidaps/danaRKorean/DanaRKoreanPlugin;", "setDanaRKoreanPlugin", "(Linfo/nightscout/androidaps/danaRKorean/DanaRKoreanPlugin;)V", "danaRPlugin", "Linfo/nightscout/androidaps/danar/DanaRPlugin;", "getDanaRPlugin", "()Linfo/nightscout/androidaps/danar/DanaRPlugin;", "setDanaRPlugin", "(Linfo/nightscout/androidaps/danar/DanaRPlugin;)V", "danaRSPlugin", "Linfo/nightscout/androidaps/danars/DanaRSPlugin;", "getDanaRSPlugin", "()Linfo/nightscout/androidaps/danars/DanaRSPlugin;", "setDanaRSPlugin", "(Linfo/nightscout/androidaps/danars/DanaRSPlugin;)V", "danaRv2Plugin", "Linfo/nightscout/androidaps/danaRv2/DanaRv2Plugin;", "getDanaRv2Plugin", "()Linfo/nightscout/androidaps/danaRv2/DanaRv2Plugin;", "setDanaRv2Plugin", "(Linfo/nightscout/androidaps/danaRv2/DanaRv2Plugin;)V", "dexcomPlugin", "Linfo/nightscout/androidaps/plugins/source/DexcomPlugin;", "getDexcomPlugin", "()Linfo/nightscout/androidaps/plugins/source/DexcomPlugin;", "setDexcomPlugin", "(Linfo/nightscout/androidaps/plugins/source/DexcomPlugin;)V", "eversensePlugin", "Linfo/nightscout/androidaps/plugins/source/EversensePlugin;", "getEversensePlugin", "()Linfo/nightscout/androidaps/plugins/source/EversensePlugin;", "setEversensePlugin", "(Linfo/nightscout/androidaps/plugins/source/EversensePlugin;)V", "filter", "", "glimpPlugin", "Linfo/nightscout/androidaps/plugins/source/GlimpPlugin;", "getGlimpPlugin", "()Linfo/nightscout/androidaps/plugins/source/GlimpPlugin;", "setGlimpPlugin", "(Linfo/nightscout/androidaps/plugins/source/GlimpPlugin;)V", "insulinOrefFreePeakPlugin", "Linfo/nightscout/androidaps/plugins/insulin/InsulinOrefFreePeakPlugin;", "getInsulinOrefFreePeakPlugin", "()Linfo/nightscout/androidaps/plugins/insulin/InsulinOrefFreePeakPlugin;", "setInsulinOrefFreePeakPlugin", "(Linfo/nightscout/androidaps/plugins/insulin/InsulinOrefFreePeakPlugin;)V", "localInsightPlugin", "Linfo/nightscout/androidaps/plugins/pump/insight/LocalInsightPlugin;", "getLocalInsightPlugin", "()Linfo/nightscout/androidaps/plugins/pump/insight/LocalInsightPlugin;", "setLocalInsightPlugin", "(Linfo/nightscout/androidaps/plugins/pump/insight/LocalInsightPlugin;)V", "loopPlugin", "Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;", "getLoopPlugin", "()Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;", "setLoopPlugin", "(Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;)V", "maintenancePlugin", "Linfo/nightscout/androidaps/plugins/general/maintenance/MaintenancePlugin;", "getMaintenancePlugin", "()Linfo/nightscout/androidaps/plugins/general/maintenance/MaintenancePlugin;", "setMaintenancePlugin", "(Linfo/nightscout/androidaps/plugins/general/maintenance/MaintenancePlugin;)V", "medtronicPumpPlugin", "Linfo/nightscout/androidaps/plugins/pump/medtronic/MedtronicPumpPlugin;", "getMedtronicPumpPlugin", "()Linfo/nightscout/androidaps/plugins/pump/medtronic/MedtronicPumpPlugin;", "setMedtronicPumpPlugin", "(Linfo/nightscout/androidaps/plugins/pump/medtronic/MedtronicPumpPlugin;)V", "nsClientPlugin", "Linfo/nightscout/androidaps/plugins/general/nsclient/NSClientPlugin;", "getNsClientPlugin", "()Linfo/nightscout/androidaps/plugins/general/nsclient/NSClientPlugin;", "setNsClientPlugin", "(Linfo/nightscout/androidaps/plugins/general/nsclient/NSClientPlugin;)V", "nsSettingStatus", "Linfo/nightscout/androidaps/plugins/general/nsclient/data/NSSettingsStatus;", "getNsSettingStatus", "()Linfo/nightscout/androidaps/plugins/general/nsclient/data/NSSettingsStatus;", "setNsSettingStatus", "(Linfo/nightscout/androidaps/plugins/general/nsclient/data/NSSettingsStatus;)V", "openAPSAMAPlugin", "Linfo/nightscout/androidaps/plugins/aps/openAPSAMA/OpenAPSAMAPlugin;", "getOpenAPSAMAPlugin", "()Linfo/nightscout/androidaps/plugins/aps/openAPSAMA/OpenAPSAMAPlugin;", "setOpenAPSAMAPlugin", "(Linfo/nightscout/androidaps/plugins/aps/openAPSAMA/OpenAPSAMAPlugin;)V", "openAPSSMBPlugin", "Linfo/nightscout/androidaps/plugins/aps/openAPSSMB/OpenAPSSMBPlugin;", "getOpenAPSSMBPlugin", "()Linfo/nightscout/androidaps/plugins/aps/openAPSSMB/OpenAPSSMBPlugin;", "setOpenAPSSMBPlugin", "(Linfo/nightscout/androidaps/plugins/aps/openAPSSMB/OpenAPSSMBPlugin;)V", "openHumansUploader", "Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansUploader;", "getOpenHumansUploader", "()Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansUploader;", "setOpenHumansUploader", "(Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansUploader;)V", "passwordCheck", "Linfo/nightscout/androidaps/utils/protection/PasswordCheck;", "getPasswordCheck", "()Linfo/nightscout/androidaps/utils/protection/PasswordCheck;", "setPasswordCheck", "(Linfo/nightscout/androidaps/utils/protection/PasswordCheck;)V", "pluginId", "", "pluginStore", "Linfo/nightscout/androidaps/plugins/configBuilder/PluginStore;", "getPluginStore", "()Linfo/nightscout/androidaps/plugins/configBuilder/PluginStore;", "setPluginStore", "(Linfo/nightscout/androidaps/plugins/configBuilder/PluginStore;)V", "poctechPlugin", "Linfo/nightscout/androidaps/plugins/source/PoctechPlugin;", "getPoctechPlugin", "()Linfo/nightscout/androidaps/plugins/source/PoctechPlugin;", "setPoctechPlugin", "(Linfo/nightscout/androidaps/plugins/source/PoctechPlugin;)V", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "getProfileFunction", "()Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "setProfileFunction", "(Linfo/nightscout/androidaps/interfaces/ProfileFunction;)V", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "setResourceHelper", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "getRxBus", "()Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "setRxBus", "(Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;)V", "safetyPlugin", "Linfo/nightscout/androidaps/plugins/constraints/safety/SafetyPlugin;", "getSafetyPlugin", "()Linfo/nightscout/androidaps/plugins/constraints/safety/SafetyPlugin;", "setSafetyPlugin", "(Linfo/nightscout/androidaps/plugins/constraints/safety/SafetyPlugin;)V", "sensitivityAAPSPlugin", "Linfo/nightscout/androidaps/plugins/sensitivity/SensitivityAAPSPlugin;", "getSensitivityAAPSPlugin", "()Linfo/nightscout/androidaps/plugins/sensitivity/SensitivityAAPSPlugin;", "setSensitivityAAPSPlugin", "(Linfo/nightscout/androidaps/plugins/sensitivity/SensitivityAAPSPlugin;)V", "sensitivityOref1Plugin", "Linfo/nightscout/androidaps/plugins/sensitivity/SensitivityOref1Plugin;", "getSensitivityOref1Plugin", "()Linfo/nightscout/androidaps/plugins/sensitivity/SensitivityOref1Plugin;", "setSensitivityOref1Plugin", "(Linfo/nightscout/androidaps/plugins/sensitivity/SensitivityOref1Plugin;)V", "sensitivityWeightedAveragePlugin", "Linfo/nightscout/androidaps/plugins/sensitivity/SensitivityWeightedAveragePlugin;", "getSensitivityWeightedAveragePlugin", "()Linfo/nightscout/androidaps/plugins/sensitivity/SensitivityWeightedAveragePlugin;", "setSensitivityWeightedAveragePlugin", "(Linfo/nightscout/androidaps/plugins/sensitivity/SensitivityWeightedAveragePlugin;)V", "smsCommunicatorPlugin", "Linfo/nightscout/androidaps/plugins/general/smsCommunicator/SmsCommunicatorPlugin;", "getSmsCommunicatorPlugin", "()Linfo/nightscout/androidaps/plugins/general/smsCommunicator/SmsCommunicatorPlugin;", "setSmsCommunicatorPlugin", "(Linfo/nightscout/androidaps/plugins/general/smsCommunicator/SmsCommunicatorPlugin;)V", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "getSp", "()Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "setSp", "(Linfo/nightscout/androidaps/utils/sharedPreferences/SP;)V", "statusLinePlugin", "Linfo/nightscout/androidaps/plugins/general/xdripStatusline/StatusLinePlugin;", "getStatusLinePlugin", "()Linfo/nightscout/androidaps/plugins/general/xdripStatusline/StatusLinePlugin;", "setStatusLinePlugin", "(Linfo/nightscout/androidaps/plugins/general/xdripStatusline/StatusLinePlugin;)V", "tidepoolPlugin", "Linfo/nightscout/androidaps/plugins/general/tidepool/TidepoolPlugin;", "getTidepoolPlugin", "()Linfo/nightscout/androidaps/plugins/general/tidepool/TidepoolPlugin;", "setTidepoolPlugin", "(Linfo/nightscout/androidaps/plugins/general/tidepool/TidepoolPlugin;)V", "tomatoPlugin", "Linfo/nightscout/androidaps/plugins/source/TomatoPlugin;", "getTomatoPlugin", "()Linfo/nightscout/androidaps/plugins/source/TomatoPlugin;", "setTomatoPlugin", "(Linfo/nightscout/androidaps/plugins/source/TomatoPlugin;)V", "virtualPumpPlugin", "Linfo/nightscout/androidaps/plugins/pump/virtual/VirtualPumpPlugin;", "getVirtualPumpPlugin", "()Linfo/nightscout/androidaps/plugins/pump/virtual/VirtualPumpPlugin;", "setVirtualPumpPlugin", "(Linfo/nightscout/androidaps/plugins/pump/virtual/VirtualPumpPlugin;)V", "wearPlugin", "Linfo/nightscout/androidaps/plugins/general/wear/WearPlugin;", "getWearPlugin", "()Linfo/nightscout/androidaps/plugins/general/wear/WearPlugin;", "setWearPlugin", "(Linfo/nightscout/androidaps/plugins/general/wear/WearPlugin;)V", "addPreferencesFromResource", "", "preferencesResId", "key", "enabled", "", "addPreferencesFromResourceIfEnabled", "p", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "rootKey", "adjustUnitDependentPrefs", "pref", "Landroidx/preference/Preference;", "checkForBiometricFallback", "initSummary", "isSinglePreference", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreatePreferences", "onDestroy", "onPreferenceTreeClick", "preference", "onSaveInstanceState", "outState", "onSharedPreferenceChanged", "sharedPreferences", "Landroid/content/SharedPreferences;", "preprocessPreferences", "setArguments", "args", "setFilter", "updateFilterVisibility", "updatePrefSummary", "app_fullRelease"})
public final class MyPreferenceFragment extends androidx.preference.PreferenceFragmentCompat implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    private int pluginId = -1;
    private java.lang.String filter = "";
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.sharedPreferences.SP sp;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ProfileFunction profileFunction;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.configBuilder.PluginStore pluginStore;
    @javax.inject.Inject()
    public info.nightscout.androidaps.Config config;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.automation.AutomationPlugin automationPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.danar.DanaRPlugin danaRPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.danaRKorean.DanaRKoreanPlugin danaRKoreanPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.danaRv2.DanaRv2Plugin danaRv2Plugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.danars.DanaRSPlugin danaRSPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.pump.combo.ComboPlugin comboPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.insulin.InsulinOrefFreePeakPlugin insulinOrefFreePeakPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.aps.loop.LoopPlugin loopPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.pump.insight.LocalInsightPlugin localInsightPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.pump.medtronic.MedtronicPumpPlugin medtronicPumpPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.nsclient.NSClientPlugin nsClientPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.aps.openAPSAMA.OpenAPSAMAPlugin openAPSAMAPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.aps.openAPSSMB.OpenAPSSMBPlugin openAPSSMBPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.constraints.safety.SafetyPlugin safetyPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.sensitivity.SensitivityAAPSPlugin sensitivityAAPSPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.sensitivity.SensitivityOref1Plugin sensitivityOref1Plugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.sensitivity.SensitivityWeightedAveragePlugin sensitivityWeightedAveragePlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.source.DexcomPlugin dexcomPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.source.EversensePlugin eversensePlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.source.GlimpPlugin glimpPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.source.PoctechPlugin poctechPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.source.TomatoPlugin tomatoPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.smsCommunicator.SmsCommunicatorPlugin smsCommunicatorPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.xdripStatusline.StatusLinePlugin statusLinePlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.tidepool.TidepoolPlugin tidepoolPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.pump.virtual.VirtualPumpPlugin virtualPumpPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.wear.WearPlugin wearPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.maintenance.MaintenancePlugin maintenancePlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.protection.PasswordCheck passwordCheck;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.nsclient.data.NSSettingsStatus nsSettingStatus;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.openhumans.OpenHumansUploader openHumansUploader;
    private java.util.HashMap _$_findViewCache;
    
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
    public final info.nightscout.androidaps.utils.sharedPreferences.SP getSp() {
        return null;
    }
    
    public final void setSp(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ProfileFunction getProfileFunction() {
        return null;
    }
    
    public final void setProfileFunction(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.configBuilder.PluginStore getPluginStore() {
        return null;
    }
    
    public final void setPluginStore(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.configBuilder.PluginStore p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.Config getConfig() {
        return null;
    }
    
    public final void setConfig(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.Config p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.AutomationPlugin getAutomationPlugin() {
        return null;
    }
    
    public final void setAutomationPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.AutomationPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.danar.DanaRPlugin getDanaRPlugin() {
        return null;
    }
    
    public final void setDanaRPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.danar.DanaRPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.danaRKorean.DanaRKoreanPlugin getDanaRKoreanPlugin() {
        return null;
    }
    
    public final void setDanaRKoreanPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.danaRKorean.DanaRKoreanPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.danaRv2.DanaRv2Plugin getDanaRv2Plugin() {
        return null;
    }
    
    public final void setDanaRv2Plugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.danaRv2.DanaRv2Plugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.danars.DanaRSPlugin getDanaRSPlugin() {
        return null;
    }
    
    public final void setDanaRSPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.danars.DanaRSPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.pump.combo.ComboPlugin getComboPlugin() {
        return null;
    }
    
    public final void setComboPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.pump.combo.ComboPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.insulin.InsulinOrefFreePeakPlugin getInsulinOrefFreePeakPlugin() {
        return null;
    }
    
    public final void setInsulinOrefFreePeakPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.insulin.InsulinOrefFreePeakPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.aps.loop.LoopPlugin getLoopPlugin() {
        return null;
    }
    
    public final void setLoopPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.aps.loop.LoopPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.pump.insight.LocalInsightPlugin getLocalInsightPlugin() {
        return null;
    }
    
    public final void setLocalInsightPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.pump.insight.LocalInsightPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.pump.medtronic.MedtronicPumpPlugin getMedtronicPumpPlugin() {
        return null;
    }
    
    public final void setMedtronicPumpPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.pump.medtronic.MedtronicPumpPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.nsclient.NSClientPlugin getNsClientPlugin() {
        return null;
    }
    
    public final void setNsClientPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.nsclient.NSClientPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.aps.openAPSAMA.OpenAPSAMAPlugin getOpenAPSAMAPlugin() {
        return null;
    }
    
    public final void setOpenAPSAMAPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.aps.openAPSAMA.OpenAPSAMAPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.aps.openAPSSMB.OpenAPSSMBPlugin getOpenAPSSMBPlugin() {
        return null;
    }
    
    public final void setOpenAPSSMBPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.aps.openAPSSMB.OpenAPSSMBPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.constraints.safety.SafetyPlugin getSafetyPlugin() {
        return null;
    }
    
    public final void setSafetyPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.constraints.safety.SafetyPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.sensitivity.SensitivityAAPSPlugin getSensitivityAAPSPlugin() {
        return null;
    }
    
    public final void setSensitivityAAPSPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.sensitivity.SensitivityAAPSPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.sensitivity.SensitivityOref1Plugin getSensitivityOref1Plugin() {
        return null;
    }
    
    public final void setSensitivityOref1Plugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.sensitivity.SensitivityOref1Plugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.sensitivity.SensitivityWeightedAveragePlugin getSensitivityWeightedAveragePlugin() {
        return null;
    }
    
    public final void setSensitivityWeightedAveragePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.sensitivity.SensitivityWeightedAveragePlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.source.DexcomPlugin getDexcomPlugin() {
        return null;
    }
    
    public final void setDexcomPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.source.DexcomPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.source.EversensePlugin getEversensePlugin() {
        return null;
    }
    
    public final void setEversensePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.source.EversensePlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.source.GlimpPlugin getGlimpPlugin() {
        return null;
    }
    
    public final void setGlimpPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.source.GlimpPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.source.PoctechPlugin getPoctechPlugin() {
        return null;
    }
    
    public final void setPoctechPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.source.PoctechPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.source.TomatoPlugin getTomatoPlugin() {
        return null;
    }
    
    public final void setTomatoPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.source.TomatoPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.smsCommunicator.SmsCommunicatorPlugin getSmsCommunicatorPlugin() {
        return null;
    }
    
    public final void setSmsCommunicatorPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.smsCommunicator.SmsCommunicatorPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.xdripStatusline.StatusLinePlugin getStatusLinePlugin() {
        return null;
    }
    
    public final void setStatusLinePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.xdripStatusline.StatusLinePlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.tidepool.TidepoolPlugin getTidepoolPlugin() {
        return null;
    }
    
    public final void setTidepoolPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.tidepool.TidepoolPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.pump.virtual.VirtualPumpPlugin getVirtualPumpPlugin() {
        return null;
    }
    
    public final void setVirtualPumpPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.pump.virtual.VirtualPumpPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.wear.WearPlugin getWearPlugin() {
        return null;
    }
    
    public final void setWearPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.wear.WearPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.maintenance.MaintenancePlugin getMaintenancePlugin() {
        return null;
    }
    
    public final void setMaintenancePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.maintenance.MaintenancePlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.protection.PasswordCheck getPasswordCheck() {
        return null;
    }
    
    public final void setPasswordCheck(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.protection.PasswordCheck p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.nsclient.data.NSSettingsStatus getNsSettingStatus() {
        return null;
    }
    
    public final void setNsSettingStatus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.nsclient.data.NSSettingsStatus p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.openhumans.OpenHumansUploader getOpenHumansUploader() {
        return null;
    }
    
    public final void setOpenHumansUploader(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.openhumans.OpenHumansUploader p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void setArguments(@org.jetbrains.annotations.Nullable()
    android.os.Bundle args) {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void addPreferencesFromResourceIfEnabled(info.nightscout.androidaps.interfaces.PluginBase p, java.lang.String rootKey, boolean enabled) {
    }
    
    private final void addPreferencesFromResourceIfEnabled(info.nightscout.androidaps.interfaces.PluginBase p, java.lang.String rootKey) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreatePreferences(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable()
    java.lang.String rootKey) {
    }
    
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    private final void preprocessPreferences() {
    }
    
    private final void checkForBiometricFallback(java.lang.String key) {
    }
    
    private final void addPreferencesFromResource(@androidx.annotation.XmlRes()
    @kotlin.Suppress(names = {"SameParameterValue"})
    int preferencesResId, java.lang.String key, boolean enabled) {
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    private final void addPreferencesFromResource(@androidx.annotation.XmlRes()
    int preferencesResId, java.lang.String key) {
    }
    
    private final void adjustUnitDependentPrefs(androidx.preference.Preference pref) {
    }
    
    private final boolean updateFilterVisibility(java.lang.String filter, androidx.preference.Preference p) {
        return false;
    }
    
    private final void updatePrefSummary(androidx.preference.Preference pref) {
    }
    
    private final void initSummary(androidx.preference.Preference p, boolean isSinglePreference) {
    }
    
    @java.lang.Override()
    public boolean onPreferenceTreeClick(@org.jetbrains.annotations.Nullable()
    androidx.preference.Preference preference) {
        return false;
    }
    
    public final void setFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String filter) {
    }
    
    public MyPreferenceFragment() {
        super();
    }
}